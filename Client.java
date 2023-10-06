package commandPattern;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    private static DeviceController controller = new DeviceController();
    private static Device selectedDevice;

    public static void main(String[] args) {
    }
   
    public static void devicesMenu() {
        System.out.println(
        		  "Devices:"
        		+ "\n\t1. Light"
        		+ "\n\t2. Thermostat"
        		+ "\n\t3. Music Player"
        		+ "\n\t4. TV"
        		+ "\n\t5. Fan");
        System.out.print("\n\nSelect a device to control: ");

        int choice = scanner.nextInt();
        selectedDevice = createDevice(choice);

        if (selectedDevice == null) {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        while (true) {
            displayActions();

            int action = scanner.nextInt();
            handleAction(action);

            controller.executeCommands(selectedDevice);
        }
    }
   
    private static void displayActions() {
        System.out.println(
        		  "\n\nActions:"
        		+ "\n\t1. Turn On"
        		+ "\n\t2. Turn Off");
        if (selectedDevice instanceof LightDevice) {
            System.out.println(
            		  "\n\t3. Adjust Brightness"
            		+ "\n\t4. Change Color"
            		+ "\n\t5. Exit");
        } else if (selectedDevice instanceof ThermostatDevice) {
            System.out.println(
            		  "\n\t3. Set Temperature"
            		+ "\n\t4. Exit");
        } else if (selectedDevice instanceof MusicPlayerDevice) {
            System.out.println(
            		  "\n\t3. Play Playlist"
            		+ "\n\t4. Exit");
        } else if (selectedDevice instanceof TVDevice) {
            System.out.println(
            		  "\n\t3. Change Channel"
            		+ "\n\t4. Exit");
        } else if (selectedDevice instanceof FanDevice) {
            System.out.println(
            		  "\n\t3. Adjust Fan Speed"
            		+ "\n\t4. Exit");
        }
        System.out.print("\nSelect an action: ");
    }

    private static void handleAction(int action) {
        switch (action) {
            case 1:
                turnOn();
                break;
            case 2:
                turnOff();
                break;
            case 3:
                if (selectedDevice instanceof LightDevice) {
                    System.out.println("Enter brightness level: ");
                    int brightnessLevel = scanner.nextInt();
                    controller.addCommand(new AdjustBrightnessCommand(brightnessLevel));
                } else if (selectedDevice instanceof ThermostatDevice) {
                    System.out.println("Enter temperature: ");
                    int temperature = scanner.nextInt();
                    controller.addCommand(new SetTemperatureCommand(temperature));
                } else if (selectedDevice instanceof MusicPlayerDevice) {
                    System.out.println("Enter playlist: ");
                    String playlist = scanner.next();
                    controller.addCommand(new PlayPlaylistCommand(playlist));
                } else if (selectedDevice instanceof TVDevice) {
                    System.out.println("Enter channel: ");
                    int channel = scanner.nextInt();
                    controller.addCommand(new ChangeChannelCommand((TVDevice) selectedDevice, channel));
                } else if (selectedDevice instanceof FanDevice) {
                    System.out.println("Enter speed level: ");
                    int speedLevel = scanner.nextInt();
                    controller.addCommand(new AdjustSpeedCommand((FanDevice) selectedDevice, speedLevel));
                } else {
                    System.out.println("Invalid action for this device.");
                }
                break;
            case 4:
                if (selectedDevice instanceof LightDevice) {
                    System.out.println("Enter color: ");
                    String color = scanner.next();
                    controller.addCommand(new ChangeColorCommand(color));
                }
                break;
            case 5:
                returnToMain();  // Go back to the main menu
                break;
            default:
                System.out.println("Invalid action. Try again.");
        }
    }

    private static void returnToMain() {
        System.out.println("\nReturning to main menu...");
        System.out.println("Devices: ");
        System.out.println("1. Light");
        System.out.println("2. Thermostat");
        System.out.println("3. Music Player");
        System.out.println("4. TV");
        System.out.println("5. Fan\n");
        System.out.print("Select a device to control: ");

        int choice = scanner.nextInt();
        selectedDevice = createDevice(choice);

        if (selectedDevice == null) {
            System.out.println("Invalid choice. Exiting...");
            exit();
        }
    }

    
    public static void exit() {
        scanner.close();
        System.out.println("Exiting...");
        System.exit(0);
    }

    public static void turnOn() {
    	controller.addCommand(new TurnOnCommand());
    }
    
    public static void turnOff() {
    	controller.addCommand(new TurnOffCommand());
    }

    private static Device createDevice(int choice) {
        switch (choice) {
            case 1:
                return new LightDevice();
            case 2:
                return new ThermostatDevice();
            case 3:
                return new MusicPlayerDevice();
            case 4:
                return new TVDevice();
            case 5:
                return new FanDevice();
            default:
                return null;
        }
    }
}

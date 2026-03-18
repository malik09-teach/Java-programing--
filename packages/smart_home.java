package week_09;

import java.util.Scanner;



public class smart_home {


    class lights {
        String room_name, status;

        lights(String room_name, String status) {
            this.room_name = room_name;
            this.status = status;
        }

        String getStatus() {
            return status;
        }

        void turnOn() {
            System.out.println("ROOM NAME: " + room_name + "\nStatus: " + getStatus());
        }

        void turnOff() {
            System.out.println("ROOM NAME: " + room_name + "\nStatus: " + getStatus());
        }
    }

   
    static class thermostate {
        static int temp;

        thermostate(int temp) {
            thermostate.temp = temp;
        }

        static void show() {
            System.out.println("Temperature of room: " + temp + "°C");
        }
    }

 
    public void manageSecurity(String userChoice) {
        class Security {
            public void arm() {
                System.out.println("Security system ARMED.");
            }

            public void disarm() {
                System.out.println("Security system DISARMED.");
            }
        }

        Security security = new Security();

        if (userChoice.equalsIgnoreCase("yes")) {
            security.arm();
        } else {
            security.disarm();
        }
    }
    
    interface RemoteControl {
        void execute();
    }

    public void useRemoteControl() {
        RemoteControl remote = new RemoteControl() {
        	
        @Override
           public void execute() {
                System.out.println("Executing remote command: Switching all systems to Energy Saving Mode...");
            }
     
        };
        
        remote.execute();

       
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        smart_home home1 = new smart_home();

       
        System.out.print("\nEnter room name: ");
        String name = sc.nextLine();

        
        System.out.print("Enter room light status (on/off): ");
        String status = sc.nextLine();

     
        System.out.print("Enter temperature of room: ");
        int temp = sc.nextInt();
        sc.nextLine(); 

    
        System.out.print("Is the security system armed? (yes/no): ");
        String state = sc.nextLine();

      
        if (status.equalsIgnoreCase("on")) {
            lights r1 = home1.new lights(name, status);
            r1.turnOn();
        } else if (status.equalsIgnoreCase("off")) {
            lights r1 = home1.new lights(name, status);
            r1.turnOff();
        } else {
            System.out.println("Invalid light status.");
        }

    
        thermostate room_01 = new thermostate(temp);
        thermostate.show();
        
        home1.manageSecurity(state);
        home1.useRemoteControl();
        sc.close();
    }
}


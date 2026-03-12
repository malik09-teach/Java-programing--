package inner_class;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

class ChatRoom {
    
    // Static Nested Class: User
    static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    // Static Nested Class: Message
    static class Message {
        private String sender;
        private String content;

        public Message(String sender, String content) {
            this.sender = sender;
            this.content = content;
        }

        public String getSender() {
            return sender;
        }

        public String getContent() {
            return content;
        }
    }

    private List<User> users = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public void addUser(String name) {
        users.add(new User(name));
        System.out.println(name + " joined the chat room.");
    }

    public void sendMessage(String sender, String content) {
       // Message message = new Message(sender, content);
        messages.add(new  Message (sender, content));
       // messages.add(message);
        
        // Anonymous Inner Class for handling message delivery
        Runnable messageHandler = new Runnable() {
            @Override
            public void run() {
                System.out.println(sender + ": " + content);
            }
        };

        // Simulate message delivery
        messageHandler.run();
    }
}

/*

public class project_message_sender {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();

        while (true) {
            System.out.print("Enter user name (or type 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter address for " + name + ": ");
            String address = scanner.nextLine();

            users.add(name);
            addresses.add(address);
            chatRoom.addUser(name);

            String message = "Address for " + name + " on APC is " + address;
            chatRoom.sendMessage(name, message);
        }

        System.out.println("\nAll Users and Addresses:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i) + ": " + addresses.get(i));
        }

        scanner.close();
    }
}


/*
public class project_message_sender {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many users do you want to enter? ");
        int totalUsers = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();
        
        int count = 0;
        while (count < totalUsers) {
            System.out.print("Enter user name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address for " + name + ": ");
            String address = scanner.nextLine();

            users.add(name);
            addresses.add(address);
            chatRoom.addUser(name);

            String message = "Address for " + name + " on APC is " + address;
            chatRoom.sendMessage(name, message);

            count++;
        }

        System.out.println("\nAll Users and Addresses:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i) + ": " + addresses.get(i));
        }

        scanner.close();
    }
}



*/
public class project_message_sender {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        
        
        
        
        chatRoom.addUser("Alice");
        chatRoom.addUser("Bob");
        
        chatRoom.addUser("malik");
        chatRoom.addUser("khan");
        chatRoom.addUser("nayeem");
        chatRoom.addUser("alex");
        

        // Simulate messages
        chatRoom.sendMessage("Alice", "Hello, Bob!");
        chatRoom.sendMessage("Bob", "Hi, Alice! How are you?");
        chatRoom.sendMessage("malik", "Hi, Alice! How are you?");
        chatRoom.sendMessage("alex", "Hi, Alice! How are you?");
        chatRoom.sendMessage("nayeem", "Hi, Alice! How are you?");
        chatRoom.sendMessage("", "Hi, Alice! How are you?");
        
        
    
    }
}



/*
 Enhancements:
Add Private Messaging:
Extend the sendMessage method to handle private messages between users.
Offline Message Storage:
Store messages for users who are offline, and deliver them when they rejoin.
GUI with JavaFX:
Add a graphical interface where users can join the room and chat in real-time.
Moderation Features:
Add a static nested Moderator class to allow admin actions like banning users or deleting messages.
Message Encryption:
Use a simple encryption algorithm for messages.
*/
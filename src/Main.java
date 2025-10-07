import java.util.ArrayList;
import java.util.Scanner;


class Main {

    //    Add task


    
    static void add(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task name:");
        String task = sc.nextLine();
        list.add(task);
    }
//    View tasks



    static void view(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("No tasks found");
            return;
        }
        System.out.println("-----------  Tasks ---------------");
        for(int i=0;i<list.size();i++) {
            System.out.println((i+1) + " " + list.get(i));
        }
        System.out.println("-----------  Tasks ---------------");
    }
//    Remove task a number




    static void remove(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("No tasks found");
            return;
        }else{
            Scanner sc = new Scanner(System.in);
            view(list);
            System.out.println("how are you doing? (1--- remove or 2---No)");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter number to remove:");
                int num = sc.nextInt();
                list.remove(num-1);
                System.out.println("Good Remove is true");
            }else if (choice == 2) {
                System.out.println("Ok");
            }else {
                System.out.println("Invalid choice");
            }
        }
    }




    public static void main(String[] args) {
//        Array + Scanner
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

//        choice 1 or 2 or 3 or 4
        String text = """
                1 --- Add task
                2 --- View task
                3 --- Remove task + View task
                4 --- Exit
                """;

//        run
        while (true) {
            System.out.println(text);
            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                add(list);
            }else if (choice == 2) {
                view(list);
            } else if (choice == 3) {
                remove(list);
            } else if (choice == 4) {
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }

    }
}
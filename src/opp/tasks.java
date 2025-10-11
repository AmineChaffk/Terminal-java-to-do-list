package opp;
import java.util.ArrayList;
import java.util.Scanner;

public class tasks {
    ArrayList<tasks> list = new ArrayList<tasks>();
    public String task;
    Scanner sc = new Scanner(System.in);
    public tasks(){}
    public tasks(String t){
        this.task = t;
    }
    public void add(){
        System.out.println("Enter task");
        this.task = sc.nextLine();
        int verify = task.length();
        if(verify > 0){
            list.add(new tasks(this.task));
            System.out.println("✅ Add is true");
        }else {
            System.out.println("Please enter the task");
        }
    }
    public void view(){
        if(list.isEmpty()){
            System.out.println("Please enter the task");
        }else {
            System.out.println("---------------- \uD83D\uDCCB tasks ------------------");
            for(int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + " --- " + list.get(i).task);
            }
            System.out.println("---------------- \uD83D\uDCCB tasks ------------------");
        }
    }
    public void delete(){
        if(list.isEmpty()){
            System.out.println("Please enter the task");
        }else {
            view();
            System.out.println("Enter Number of tasks to be deleted");
            int n = sc.nextInt();
            if(n > list.size()){
                System.out.println("Invalid input");
            }else {
                list.remove(n - 1);
                System.out.println("the task has been deleted : " + (n+1));
            }
        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //MyList<Object> a;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select the array type and capacity.");
        System.out.println("Array Type: String(1) / Integer(2)");
        int type = input.nextInt();
        System.out.println("Capacity: Default(0) / Capacity(...)");
        int cpct = (input.nextInt()==0) ? 10 : input.nextInt();
        if(type==1){
            MyList<String> a = new MyList<>(cpct);
            boolean check = true;
            while(check){
                System.out.println("Add(1) / Check(2) / Print(3) / Size(4) / Capacity(5) / Set(6) / Get(7) / Remove(8) / Check(R)(9) / Empty Check(10) / Array(11) / Clear(12) / Sublist(13) / Contain Check(14) / Exit(15)");
                int slct = input.nextInt();
                switch(slct){
                    case 1:
                    System.out.print("What to add: ");
                    a.add(input.next());
                    break;

                    case 2: // null dönememe sıkıntısını çöz...
                    System.out.print("What to check: ");
                    a.indexOf(input.next());
                    break;

                    case 3:
                    a.toString();
                    break;

                    case 4:
                    System.out.println("The size is: " + a.size());
                    break;

                    case 5:
                    a.getCapacity();
                    break;

                    case 6:
                    System.out.print("Where to set:");
                    int i = input.nextInt();
                    System.out.print("What to set:");
                    a.set(i, input.next());
                    break;

                    case 7:
                    System.out.print("What to get:");
                    a.get(input.nextInt());
                    break;

                    case 8:
                    System.out.print("What to remove:");
                    a.remove(input.nextInt());
                    break;

                    case 9:
                    System.out.print("What to check: ");
                    //instanceof ile Integer olup olmadığını kontrol et önce...
                    a.lastIndexOf(input.next());
                    break;

                    case 10:
                    a.isEmpty();
                    break;

                    case 11:
                    a.toArray();
                    break;

                    case 12:
                    a.clear();
                    break;

                    case 13: // null dönememe sıkıntısını çöz...
                    System.out.println("Sublist start: ");
                    int start = input.nextInt();
                    System.out.println("Sublist finish: ");
                    int finish = input.nextInt();
                    System.out.println(Arrays.toString(a.sublist(start, finish)));;
                    break;

                    case 14: // null dönememe sıkıntısını çöz...
                    System.out.println("What to check:");
                    if(a.contains(input.next())){
                        System.out.println("List contains your data.");
                    }
                    else{
                        System.out.println("List doesn't contain your data.");
                    }
                    break;

                    case 15:
                    System.out.println("See you later.");
                    check=false;
                    break;
                }
            }
        }
        else if(type==2){
            MyList<Integer> a = new MyList<>(cpct);
            boolean check = true;
            while(true){
                System.out.println("Add(1) / Check(2) / Print(3) / Size(4) / Capacity(5) / Set(6) / Get(7) / Remove(8) / Check(R)(9)");
                int slct = input.nextInt();
                switch(slct){
                    case 1:
                    System.out.print("What to add: ");
                    a.add(input.nextInt());
                    break;

                    case 2:
                    System.out.print("What to check: ");
                    //instanceof ile Integer olup olmadığını kontrol et önce...
                    a.indexOf(input.nextInt());
                    break;

                    case 3:
                    a.toString();
                    break;

                    case 4:
                    a.size();
                    break;

                    case 5:
                    a.getCapacity();
                    break;

                    case 6:
                    System.out.print("Where to set:");
                    int i = input.nextInt();
                    System.out.print("What to set:");
                    a.set(i, input.nextInt());
                    break;

                    case 7:
                    System.out.print("What to get:");
                    a.get(input.nextInt());
                    break;

                    case 8:
                    System.out.print("What to remove:");
                    a.remove(input.nextInt());
                    break;

                    case 9:
                    System.out.print("What to check: ");
                    //instanceof ile Integer olup olmadığını kontrol et önce...
                    a.lastIndexOf(input.nextInt());
                    break;
                }
            }
        }
        else{
            System.out.println("You didn't select a valid option!");
        }
        
        /*a.set(0, 0);
        a.set(1, 1);


        System.out.println(a.get(0));
        System.out.println(a.get(1));
        a.add(14);
        System.out.println(a.getCapacity());
        System.out.println(a.size());
        System.out.println(a.get(100));
        a.toString();*/
    }
}

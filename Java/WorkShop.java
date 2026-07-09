import java.util.Scanner;
class WorkShop {
    
    static int top = -1;
    static int choice;
    boolean found = false;
    static String[] listCar = new String[5];
    public static void main(String[] args) {
    Scanner AddCars = new Scanner(System.in);
    do{

        System.out.println("Enter your choice: ");
        System.out.println("1-Add Car: ");
        System.out.println("2-Remove Car: ");
        System.out.println("3-Top Car: ");
        System.out.println("4-Display Cars: ");
        System.out.println("5-Search Car: ");
        System.out.println("6-Exit");
        choice =AddCars.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter car name: ");
                String car = AddCars.next();
                AddCars.nextLine(); //
                push(car);
                break;
            case 2:
                pop();
                break;

            case 3:
                peek();
                break;

            case 4:
                display();
                break;
            case 5:
                System.out.println("Enter car name to search: ");
                String carToSearch = AddCars.next();
                searchCar(carToSearch);
                AddCars.toString();
                break;
            case 6:
                System.out.println("Exiting ...");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }while(choice!=6);
        AddCars.close();

    }


    public static void push(String car){
    if(top ==listCar.length -1){
    System.out.println("Stack is full");
    }
else{
    top++;
    listCar[top] = car;
}
    }

    public static void pop(){
    if(top==-1){
        System.out.println("Stack is empty");
    }
    else{
    System.out.println("popped car is: "+listCar[top]);
    top--;

    }

    }
    public static void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Cars in the stack are:");
            for(int i=top;i>=0;i--){
                System.out.println(listCar[i]);
            }
        }
}
public static void peek(){
    if(top==-1){
        System.out.println("Stack is empty");
    }
    else{
        System.out.println("Top car is: "+listCar[top]);
    }
}
public static void searchCar(String car){
for(int i=top;i>=0;i--){w
    if(listCar[i].equalslgnoreCase(car)){
        System.out.println("Car found at park: "+i);
        return;
    }
}
System.out.println("Car not found");
}
}

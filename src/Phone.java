public class Phone {
    //fields
    String number;
    String model;
    int weight;

    //constructors
    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(int weight, String number, String model){
        this(number, model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    //methods
    public  void receiveCall(String name){
        System.out.println(name + " is calling you");
    }
    public  void receiveCall(String name, String number){
        System.out.println(name + " is calling you" + "\n" + "him(her) number is " + number + "\n");
    }
    public String getNumber(){
       return number + " is subscribers number";
    }
    public void sendMessage(String number){
        System.out.println("a message will be sent to the number " + number);
    }
}

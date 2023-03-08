public class MAinCar {
    public static void main(String[] args) {
        Car car = new Car( 30 , "Car");
        Car [] array = new Car[] {  new SedanCar(10, "Pegeot"), new SportCar(1, " Lmba") };
        car.setModel(array);
        for (Car i: array){
            if ( i instanceof SportCar){
                System.out.println("этому спорткару " + i.getYears() + " лет и называется он " +  i.getName());
            } else {
                System.out.println("этому седану " + i.getYears() + " лет и называется он " +  i.getName());
            }
        }
    }

}

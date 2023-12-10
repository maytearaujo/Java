public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6", 2024, 125_000);
        car.setModelo("X5");

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor da Venda: " + car.valorVenda());
    }
}
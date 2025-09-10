import java.util.Scanner
class Prueba {
    fun sum () {
        val scanner = Scanner(System.`in`);
        print("Introduce el primer numero ");
        val num1 = scanner.nextLine().toInt();
        print("Introduce el segundo numero ");
        val num2 = scanner.nextLine().toInt();
        val result = num1 + num2;
        println("El resultado de la suma es: $result")
    }
    fun res(){
        val scanner = Scanner( System.`in`)
        print("Introduce el primer numero ");
        val num1 = scanner.nextInt()
        print("Introduce el segundo numero ");
        val num2 = scanner.nextInt()
        val result = num1 - num2
        println("El resultado de la resta es: $result")
    }
}


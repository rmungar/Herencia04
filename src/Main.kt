fun main() {
    val Andrea = Persona("Andrea", 26)
    Andrea.celebrarCumple()
    println(Andrea.toString())

    val Hector = Empleado("Héctor", 30, 1540.00, 15.0)
    Hector.celebrarCumple()
    Hector.trabajar()
    Hector.calcularSalario()
    println(Hector.toString())

    val Jose = Gerente("Jose", 41, 2000.00, 0.0, 200.00)
    Jose.celebrarCumple()
    Jose.administrar()
    Jose.trabajar()
    Jose.calcularSalario()
    println(Jose.toString())
}
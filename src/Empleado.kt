open class Empleado(override val nombre: String, override var edad:Int, salarioBase:Number, open var porcentajeImpuestos: Double = 10.0): Persona(nombre, edad) {

   open val salarioBase:Double = salarioBase.toDouble()
    init {
        if(porcentajeImpuestos >= 10.0){
            porcentajeImpuestos /= 100
        }
        else {
            porcentajeImpuestos /= 10
        }
    }

    open fun calcularSalario():Double{
        return salarioBase*porcentajeImpuestos
    }

    fun trabajar(){
        println("$nombre está trabajando en la empresa")
    }

    override fun toString(): String {
        return "${super.toString()}, Salario: %.2f".format(salarioBase)
    }
}
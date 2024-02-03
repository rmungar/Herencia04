class Gerente(override val nombre: String, override var edad:Int, override var salarioBase:Double, override var porcentajeImpuestos:Double, var bonus:Double, var exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

    override fun calcularSalario(): Double {
        if (exentoImpuestos) {
            return super.calcularSalario()+bonus
        }
        else{
            return salarioBase + bonus
        }
    }

    fun exento():String{
        if (exentoImpuestos) return "Exento"
        else{
            return "No exento"
        }
    }

    fun administrar() : String{
        return "$nombre está administrando la empresa"
    }

    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad, Salario: $2d$salarioBase, Bonus: $bonus, Exento: ${exento()}"
    }
}
class Gerente(nombre: String, edad:Int, salarioBase:Double, override var porcentajeImpuestos:Double =33.99, var bonus:Double, var exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {

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
        return "${super.toString()}, Bonus: $bonus, Exento: ${exento()}"
    }
}
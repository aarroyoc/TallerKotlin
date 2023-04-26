fun main() {
    val car = Car(
        manufacturer = "Renault",
        model = "21",
        year = 1991,
    )
    car.getYear()
}

class Car(manufacturer: String, model: String, year: Int) {
    private val manufacturer = manufacturer
    private val model = model
    private val year = year

    fun getYear() = year
}

class Car2(
    private val manufacturer: String,
    private val model: String,
    private val year: Int,
)

class Car3(
    private val manufacturer: String,
    private val model: String,
    year: Int,
) {
    private val year = year + 1000
}

class Car4(
    private val manufacturer: String,
    private val model: String,
    private val year: Int
) {
    init {
        println("Created class for car $model")
    }
}

data class Car5(
    val manufacturer: String,
    val model: String,
    val year: Int
) {
    init {
        println("Created data class for car $model")
    }
}

data class Car6(
    val manufacturer: String,
    val model: String,
    val year: Int,
) {
    constructor() : this("", "", 0)
}

sealed class Vehicle(private val year: Int) {
    open fun saySomething() {
        println("BRUM BRUM")
    }
}
class Car7(private val manufacturer: String, private val model: String, year: Int) : Vehicle(year)
class Bike(private val manufacturer: String, year: Int) : Vehicle(year) {
    override fun saySomething() {
        println("<SILENCE> <SILENCE>")
    }
}

fun brumVehicles() {
    val vehicles: List<Vehicle> = listOf(
        Car7("Renault", "21", 1991),
        Bike("Orbea", 2014)
    )

    vehicles.forEach {
        it.saySomething()
    }
}


fun Car5.printCar() {
    println(this.manufacturer + this.model + this.year)
}

data class Point(
    val x: Int,
    val y: Int,
) {
    companion object {
        const val AUTHOR = "Point Inc."
    }
}
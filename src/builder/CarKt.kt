package builder

class CarKt {
    private var name: String? = null
    private var number: String? = null
    private var price: Int? = null
    private var builtDate: Int? = null

    constructor(name: String, number: String, price: Int, builtDate: Int) {
        this.name = name
        this.number = number
        this.price = price
        this.builtDate = builtDate
    }
}
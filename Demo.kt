fun main()
{
    var name: String="Supratim"
    
    println("Hey there $name.")
    println("How are you ${name.toUpperCase()}?")
    
    println("-------------------------")
    
    var x: Int? = 100;
    println("$x")
    x= 20;
    println("$x")
    
    println("-------------------------")
    
    val y:Double? = 23.67
    println("$y")
    //y=78.34
    println("$y")
    
    println("-------------------------")
    
    val myName: String = "Supratim"
    println("${name.toUpperCase()}")
    
    println("-------------------------")
    
    var newName: String? ="Priyadarsan"
	if(newName != null) {
        println("$newName")
    } else {
        println("Can't print null String.")
    }
    
    println("-------------------------")
    
    var age: Int=19
    if(age>18) {
        println("You can vote.")
    } else {
        println("You are still a child.")
    }
    
    val doubleAgeIfVote: Int = if(age>18) {println("Age is more than 18"); 2*age} else {println("Age is less than 18"); age}
    println(doubleAgeIfVote)
    
    println("-------------------------")
    
    val testName: String = "Supratim"
    when(testName) {
        "Miao" -> {
            println("You are a cat")
        }
        "Supratim" -> {
            println("My name is $testName")
        }
        else -> {
            println("Something other name")
        }
    }
   	
    println("-------------------------")
    
    val number: Int = when(testName) {
        "Miao" -> 8
        "Supratim" -> 100
        else -> 45
    }
    
    println(number)
    
    println("-------------------------")
    
    val friends = arrayOf("Sudin","Priyadarsan","Anurag")
    for(name in friends)
    	println(name)
        
    println("-------------------------")
    
    for(i in 0..2)
    	print(friends[i]+" ")
    println()
    
   
    println("-------------------------")
   
    for(i in 0..8)
    	print("$i ")
    println()
    
    println("-------------------------")
    
    for(i in 0..8 step 2)
    	print("$i ")
    println()
    
    println("-------------------------")
    
    for(i in 10 downTo 0)
        print("$i ")
    println()
    
    println("-------------------------")
    
    for(i in 10 downTo 0 step 2)
        print("$i ")
    println()
    
    println("-------------------------")
    
    val v: Int? = 3;
    if(v in 2..5) {
        println("In if block")
    } else {
        println("In else Block")
    }
    
    println("-------------------------")
    
    //Immutable list
    val myFriends = listOf("Sudin","Supratim","Priyadarsan","Anurag")
    //myFriends[1]="Piku"   -> It is not possible as list is immutable
    for(Name in myFriends)
    	println(Name)

    println("-------------------------")
    
    //Mutable list
    val myNewFriends = mutableListOf("Sudin","Supratim","Priyadarsan","Anurag")
    myNewFriends[1]="Piku"
    for(Name in myNewFriends)
    	println(Name)
        
    println("-------------------------")
    
    //List can contain any data type
    val elements = listOf("hi",5,9.8,'i')
    for(content in elements)
    	println(content)
        
    println("-------------------------")
    
    //Generic List
    val numbers = mutableListOf<Int>(1,2,7,6,9,5)
    for(digit in numbers)
    	println(digit)
        
    println("-------------------------")
    //Function call
    
    println(operation(2,7))
    
    //Singleline function
    println(operation2(9,7))
    
    //Default value function call
    Greeting()
    Greeting("Good Morning")
    
    //passing arguments by changing order
    call(number=9999999999, name="Supratim")
}

//Function
fun operation(a: Int,b: Int) : Int {
    return a+b
}

//Singleline Function
fun operation2(a: Int,b: Int) : Int = a+b

fun Greeting(text: String = "Good Night") {
    println("$text")
}

fun call(name: String,number: Long){
    println("Call $name at $number number")
}

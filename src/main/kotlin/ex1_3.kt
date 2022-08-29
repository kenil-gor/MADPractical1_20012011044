open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{ println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int): this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{ println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    var s1=Student("Kenil","Gor",19,20012011044,"CE","C","AB7")
    var s2=Student("Het","Kikani",19,20012011052,"CE","C","AB8")
    var s3=Student("Ravi","Gohel",19,20012011043,"CE","C","AB7")
    var s4=Student("joyal","patel",19,20012011048,"CE","C","AB7")
    var s5=Student("Prasanna","pandit",19,20012011073,"CE","C","AB7")
}



import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main()  {
    // Контекст корутины
    coroutineScope{
        // корутина - запускается паралелльно с другим кодом
        launch{
            for(i in 0..5){
                delay(400L)
                println(i)
            }
        }
        println("Hello Coroutines")
    }
}

// можно вынести в отдельную функцию

suspend fun main2()= coroutineScope{
    launch{ doWork() }
    println("Hello2!")
}
suspend fun doWork(){
    for(i in 0..5){
        println(i)
        delay(400L)
    }
}
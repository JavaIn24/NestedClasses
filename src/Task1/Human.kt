package Task1

class Human (
    val name: String
){
   inner class Head {
        fun headAction(){
            println("Голова человека $name носит шапку и ест")
        }
    }

    inner class  Hand {
        fun handAction (){
            println("Руки человека $name надевают шапку и дают еду голове")
        }
    }

    inner class Legs {
        fun legsAction(){
            println("Ноги человека $name идут до шапки для того чтобы руки ее надели " +
                    "на голову и до холодильника чтобы дать еду рукам которые дадут ее голове")
        }
    }

    fun printInfo (){
        var head = Head ()
        var hand = Hand()
        var legs = Legs()
        head.headAction()
        hand.handAction()
        legs.legsAction()



    }


}

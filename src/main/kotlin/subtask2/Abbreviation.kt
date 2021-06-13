package subtask2

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        var m=0
        for (i in a){
            if ( b[m]==i || b[m].toLowerCase()==i){
                m++
                if (m==b.length) return "YES"
            }
        }
        return  "NO"
        throw NotImplementedError("Not implemented")
    }
}
//|| b[m].toLowerCase()==i   b[m]==i

fun main() {
    var input = readLine() ?: ""
    val s = input.split(" ")
    var ans:Boolean = true
    var keep = mutableListOf<String>()
    for(i in 0..s.size-1) {
        if(s[i] == "{" || s[i] == "[" || s[i] == "(") {
            keep.add(s[i])
        } else if(keep.last() == "{" && s[i] == "}") {
            keep.remove(keep.last())
        } else if(keep.last() == "[" && s[i] == "]") {
            keep.remove(keep.last())
        } else if(keep.last() == "(" && s[i] == ")") {
            keep.remove(keep.last())
        } else {
            ans = false
            break
        }
    }
    if(ans) {
        println("YES")
    } else {
        println("NO")
    }
}
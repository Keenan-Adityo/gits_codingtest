fun main() {
    var index = Integer.valueOf(readLine())
    var input = readLine() ?: ""
    val score = input.split(" ")
    val n = Integer.valueOf(readLine())
    input = readLine() ?: ""
    val gits = input.split(" ")
    
    for(i in 0..n-1) {
        var ans:Int = 0
        var before:Int = 0
        for(j in 0..index-1) {
            if(score[j].toInt() != before) {
                before = score[j].toInt()
                ans++;
                if(gits[i].toInt() >= score[j].toInt()) {
                    print(ans)
                    break
                }
            }
            if(j == index-1) {
                print(ans + 1)
            }
        }
        
        if(i != n-1) {
            print(" ")
        }
    }
    
}
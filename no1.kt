fun main() {
    var n = Integer.valueOf(readLine())
    for(i in 0..n-1) {
        var ans = (i*(i+1)/2) + 1
        print(ans)
        if(i != n-1) {
            print("-")
        }
    }
}
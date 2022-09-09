package Kotlin1

fun main() {

    val NumberArr = intArrayOf(1, 6, 8, 5, 2, 5, 8, 9);

    if (5 in NumberArr) {
        println("Trong mảng có số 5");
    } else {
        println("Trong mảng không có số 5")
    }
    if (9 !in NumberArr) {
        println("Trong mảng không có số 9");
    } else {
        println("Trong mảng có số 9")
    }

    //Toán tử truy cập chỉ số

//    Biểu thức	Dịch sang ngôn ngữ lập trình Kotlin
//    a[i]	a.get(i)
//    a[i, n]	a.get(i, n)
//    a[i1, i2, …, in]	a.get(i1, i2, …, in)
//    a[i] = b	a.set(i, b)
//    a[i, n] = b	a.set(i, n, b)
//    a[i1, i2, …, in] = b	a.set(i1, i2, …, in, b)
}


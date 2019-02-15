fun f() {
    val a: Any? = null;
    a.isBooleanOrInt();
    if(a == null) { }
}

fun Any?.isBooleanOrInt(): Boolean = when(this) {
    is Boolean, is Int-> true
    else -> false
}
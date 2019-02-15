B b = new B();
b.foo(null); // True positive

A a = new B();
a.foo(null); // False negative
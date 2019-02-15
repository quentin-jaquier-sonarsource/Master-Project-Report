if(p == null) {
	customThrow();
}
p.size();

customThrow() {
	throw new MyException();
}
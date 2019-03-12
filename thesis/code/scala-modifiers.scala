def f(implicit param: Int) = {
  g
}                                        
 
def g(implicit param: Int) = {
  print(param)
}  
object ParentesisBalanceados:
  def main(args:Array[String]):Unit =
    val s="(()())"
    val ok=s.foldLeft(Option(0)){ (acc,c) => acc.flatMap(n => if c=='(' then Some(n+1) else if c==')' && n>0 then Some(n-1) else if c==')' then None else Some(n)) }.contains(0)
    println(ok)

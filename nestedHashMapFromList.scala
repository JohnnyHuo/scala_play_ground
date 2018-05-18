val c = Seq(List("adv1", "prod1", "title1"), List("adv1", "prod1", "title2"), List("adv1", "prod2", "title4"), List("adv2", "prod21", "title21"))


def nest(lli: Seq[List[String]]): Traversable[_] = {
       if (lli.head.size == 1){
          lli.flatten.distinct
         }
        else{
          lli.groupBy(_.head)
             .mapValues(vs => nest(vs.map(_.tail)))
      }
      }
      
nest(c)

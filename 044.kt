interface Expr // Define interface
class Num(val value: Int): Expr                  // Implement interface
class Sum(val left: Expr, val right: Expr): Expr // Implement interface

package myapp.frontend

import myapp.shared.domainmodel.Customer

fun main() {
  print("AppFE...")
  val cust = Customer(id=100, name="Duc Le")
  print(cust)
}
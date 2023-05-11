package myapp.backend

import myapp.shared.domainmodel.Customer

fun main() {
  print("AppBE...")
  val cust = Customer(id=200, name="Luu Dao Dung Tri")
  print(cust)
}
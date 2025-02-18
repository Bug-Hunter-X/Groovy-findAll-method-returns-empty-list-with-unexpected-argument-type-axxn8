def myList = [1, 2, 3, 4, 5]

def findEvenNumbers(list) {
  list.findAll { it instanceof Integer && it % 2 == 0 }
}

def findOddNumbers(list) {
  list.findAll { it instanceof Integer && it % 2 != 0 }
}

println "Even numbers: "+ findEvenNumbers(myList)
println "Odd numbers: "+findOddNumbers(myList)
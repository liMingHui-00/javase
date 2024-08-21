let arr = [1, 2, 3]
let brr = ["a", "b", "c"]
let c = [...arr, ...brr]
// console.log(c)
// c.find((i, d) => {
//   console.log(i)
//   console.log(d)
// })
// c.filter((item) => {
//   if (item > 2) {
//     console.log(item)
//   }
// })
let ens = c.entries()
for (let en of ens) {
  console.log(en[0])
}
console.log(c.includes("a"))

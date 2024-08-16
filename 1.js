// // // let name = 'zhnag'
// // // let reg = /^[a-zA-Z0-9]+$/
// // // if (reg.exec(name)) {
// // //   console.log('合法')
// // // }
// // // let rg = /^[\u4e00-\u9fa5]{3}$/
// // // console.log(rg.test('马化腾'))
// // console.log(date)
// // let date2 = new Date(8888, 7, 8, 8, 8, 8)
// // console.log(date2.toLocaleDateString())
// // console.log(date2.toLocaleTimeString())
// // console.log(date2.toLocaleString())
// // console.log(date.getFullYear())
// // let date = new Date()
// // console.log(date.getMinutes())
// // console.log(date.getTime())
// // console.log(date.getHours())
// // console.log(Math.floor(3.9))
// // console.log(Math.ceil(3.1))
// //3-9   包括小数
// // console.log(Math.random() * 7 + 3)
// let arr = [23, true, 'hello', undefined, null, NaN]

// arr.length = 8
// console.log(arr.length)
// arr[7] = undefined
// console.log(arr[6])

// arr.map((item, index) => {
//   console.log(item, index)
// })
// let arr = [1, 24, 32, 54, 5, 56, 7, 58, 29, 10]
// arr.sort((a, b) => {
//   return a - b
// })
// console.log(arr)
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// arr.forEach((item, index) => {
//   console.log(item, index)
// })
// for (const item of arr) {
//   console.log(item)
// }
for (const item in arr) {
  console.log(arr[item])
}

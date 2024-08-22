let list = [
  { id: 1, name: "孙悟空", gf: "72变" },
  { id: 2, name: "猪八戒", gf: "三十六变" },
]
console.log(list.find((item) => item.id == 3))
if (list.find((item) => item.id == 3)) {
  console.log("不存在")
}
console.log(Boolean(undefined))

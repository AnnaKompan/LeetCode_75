const piles1 = [3, 6, 7, 11];
const h1 = 8;
// Output: 4

const piles2 = [30, 11, 23, 4, 20];
const h2 = 5;
// Output: 30

const piles3 = [30, 11, 23, 4, 20];
const h3 = 6;
// Output: 23

function minEatingSpeed(piles, h) {
  let left = 1;
  let right = Math.max(...piles);
  min_k = right;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    let hours = 0;
    for (let pile of piles) {
      hours += Math.ceil(pile / mid);
    }
    if (hours <= h) {
      min_k = mid;
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }
  return min_k;
}

console.log(
  `Minimum integer is ${minEatingSpeed(
    piles1,
    h1
  )}, lets Koko can eat all bananas within ${h1} hours`
);
console.log(
  `Minimum integer is ${minEatingSpeed(
    piles2,
    h2
  )}, lets Koko can eat all bananas within ${h2} hours`
);
console.log(
  `Minimum integer is ${minEatingSpeed(
    piles3,
    h3
  )}, lets Koko can eat all bananas within ${h3} hours`
);

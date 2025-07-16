n1 = 10;
n2 = 1;
n3 = 2;
pick1 = 6;
pick2 = 1;
pick3 = 1;

function guess1(num) {
  pick = 6;
  if (num > pick) {
    return -1;
  } else if (num < pick) {
    return 1;
  } else {
    return 0;
  }
}

function guess2(num) {
  pick = 1;
  if (num > pick) {
    return -1;
  } else if (num < pick) {
    return 1;
  } else {
    return 0;
  }
}
function guess3(num) {
  pick = 1;
  if (num > pick) {
    return -1;
  } else if (num < pick) {
    return 1;
  } else {
    return 0;
  }
}

function guessNumber1(n) {
  let left = 1;
  let right = n;
  while (left <= right) {
    mid = Math.floor(left + (right - left) / 2);
    if (guess1(mid) == -1) {
      right = mid - 1;
    } else if (guess1(mid) == 1) {
      left = mid + 1;
    } else {
      return mid;
    }
  }
}

function guessNumber2(n) {
  let left = 1;
  let right = n;
  while (left <= right) {
    mid = Math.floor(left + (right - left) / 2);
    if (guess2(mid) == -1) {
      right = mid - 1;
    } else if (guess2(mid) == 1) {
      left = mid + 1;
    } else {
      return mid;
    }
  }
}

function guessNumber3(n) {
  let left = 1;
  let right = n;
  while (left <= right) {
    mid = Math.floor(left + (right - left) / 2);
    if (guess3(mid) == -1) {
      right = mid - 1;
    } else if (guess3(mid) == 1) {
      left = mid + 1;
    } else {
      return mid;
    }
  }
}

console.log(`First guess is: ${guessNumber1(n1)}`);
console.log(`Second guess is: ${guessNumber2(n2)}`);
console.log(`Third guess is: ${guessNumber3(n3)}`);



function calcPrimesUnderN(n) {
  for (let x = 1; x < n; x++){
    let isPrime = true;
    if (x == 1) {
      isPrime = false;
    }
    else if (x % 2 == 0 && x != 2) {
      isPrime = false;
    }
    else if (isPrime) {
      for (let y = 3; y <= Math.sqrt(x); y += 2){
        if (x % y == 0){
          isPrime = false;
          break;
        }
      }
    }

    if (isPrime) {
      console.log(x);
    }
  }
}

calcPrimesUnderN(100);

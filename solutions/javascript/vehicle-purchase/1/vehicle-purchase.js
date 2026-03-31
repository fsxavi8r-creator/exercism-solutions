// @ts-check

/**
 * Determines whether or not you need a license to operate a certain kind of vehicle.
 *
 * @param {string} kind
 * @returns {boolean} whether a license is required
 */
export function needsLicense(kind) {
  return kind === "car" || kind === "truck";
}

/**
 * Helps choosing between two options by recommending the one that
 * comes first in dictionary order.
 *
 * @param {string} option1
 * @param {string} option2
 * @returns {string} a sentence of advice which option to choose
 */
export function chooseVehicle(option1, option2) {
  /*
    take the options and put them in an array - let the array sort
    do the heavy lifting - no 'if-else' is required...I know that it
    isn't necessarily in the spirit of the exercise, but this seems
    way more efficient to me.
  */
  const sortedVehicles = [option1, option2].sort();
  return `${sortedVehicles[0]} is clearly the better choice.`;
}

/*
 * Calculates an estimate for the price of a used vehicle in the dealership
 * based on the original price and the age of the vehicle.
 *
 * @param {number} originalPrice
 * @param {number} age
 * @returns {number} expected resell price in the dealership
 */
export function calculateResellPrice(originalPrice, age) {
  /*
    this also seems more efficient to me, because it evaluates the
    expression and drops out immediately without all of the if-else
    checks.
  */
  if (age < 3) return originalPrice * 0.8;
  if (age <= 10) return originalPrice * 0.7;
  return originalPrice * 0.5;
}

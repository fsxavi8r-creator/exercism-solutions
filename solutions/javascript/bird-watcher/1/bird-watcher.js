// @ts-check

/**
 * Calculates the total bird count.
 *
 * @param {number[]} birdsPerDay
 * @returns {number} total bird count
 */
export function totalBirdCount(birdsPerDay) {
  let sumOfBirds = 0;

  if (birdsPerDay.length > 0) {
    for (let i = 0; i < birdsPerDay.length; i++) {
      sumOfBirds += birdsPerDay[i];
    }
  }
  return sumOfBirds;
}

/**
 * Calculates the total number of birds seen in a specific week.
 *
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number} birds counted in the given week
 */
export function birdsInWeek(birdsPerDay, week) {
  // We need these 2 constants to keep track of where
  // we start and stop
  const weekStart = (week - 1) * 7;
  const weekEnd = weekStart + 7;

  let sumOfBirdsForWeek = 0;

  for (let i = weekStart; i < weekEnd; i++) {
    sumOfBirdsForWeek += birdsPerDay[i];
  }
  return sumOfBirdsForWeek;
}

/**
 * Fixes the counting mistake by increasing the bird count
 * by one for every second day.
 *
 * @param {number[]} birdsPerDay
 * @returns {void} should not return anything
 */
export function fixBirdCountLog(birdsPerDay) {
  // Start at the first position, then iterate through
  // the array every 2nd position afterward.
  for (let i = 0; i < birdsPerDay.length; i += 2) {
    birdsPerDay[i]++;
  }
}

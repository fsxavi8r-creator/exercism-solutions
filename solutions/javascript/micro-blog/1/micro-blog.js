export const truncate = (input) => {
  const textLimit = 5;
  const inputChars = [...input];
  const newText = inputChars.length > textLimit ? inputChars.slice(0, textLimit).join('') : input;
  return newText;
};

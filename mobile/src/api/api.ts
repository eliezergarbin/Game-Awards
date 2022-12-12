const baseApiURL = "http://192.168.3.103:8080/api/";

export async function clientGetGames() {
  const response = await fetch(`${baseApiURL}games`);

  const json = await response.json();

  console.log(json);

  return json;
}

export async function clientSendingVotes(id: number) {
  console.log("votou");

  let requestOptions = {
    method: "PATCH",
  };

  fetch(`${baseApiURL}games/${id}/vote`, requestOptions)
    .then((response) => response.text())
    .then((result) => console.log(result))
    .catch((error) => console.log("error", error));
}

export async function clietGetWinner() {
    const response = await fetch(`${baseApiURL}games`);

    const json = await response.json();
  
    console.log(json);
  
    return json[0];
}

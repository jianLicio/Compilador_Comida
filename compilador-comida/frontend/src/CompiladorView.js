import React, { useState } from "react";
import axios from "axios";

function CompiladorView() {
  const [codigo, setCodigo] = useState("");
  const [resposta, setResposta] = useState("");

  const cozinhar = async () => {
    try {
      const response = await axios.post("http://localhost:8080/api/cozinhar", { codigo });
      setResposta(response.data);
    } catch (error) {
      setResposta("Erro ao compilar o código.");
    }
  };

  return (
    <div>
      <h1>Compilador Comida</h1>
      <textarea value={codigo} onChange={(e) => setCodigo(e.target.value)} placeholder="Digite seu código aqui..." />
      <button onClick={cozinhar}>Cozinhar</button>
      <div>
        <h2>Saída:</h2>
        <p>{resposta}</p>
      </div>
    </div>
  );
}

export default CompiladorView;

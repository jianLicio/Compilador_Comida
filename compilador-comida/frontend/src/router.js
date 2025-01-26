import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import CompiladorView from "./CompiladorView";

function AppRouter() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<CompiladorView />} />
      </Routes>
    </Router>
  );
}

export default AppRouter;

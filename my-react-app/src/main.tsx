import { createRoot } from 'react-dom/client'
import App from './App.tsx'
import './index.css'

import { BrowserRouter } from 'react-router-dom'
import {Provider} from "mobx-react";
import {store} from "./store";

createRoot(document.getElementById('root')!).render(
    <Provider store={store}>

    <BrowserRouter>
        <App />
    </BrowserRouter>
    </Provider>

)

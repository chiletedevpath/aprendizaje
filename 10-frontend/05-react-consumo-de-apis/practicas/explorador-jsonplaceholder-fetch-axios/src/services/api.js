import axios from "axios";

export const API_URL = "https://jsonplaceholder.typicode.com";

export const apiBlog = axios.create({
  baseURL: API_URL,
  timeout: 10000,
});

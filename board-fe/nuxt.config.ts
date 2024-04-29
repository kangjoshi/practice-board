// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  runtimeConfig: {
    apiOrigin: process.env.API_ORIGIN,
  },
  nitro: {
    devProxy: {
      '/api': {
        target: `${process.env.API_ORIGIN}/api`,
        changeOrigin: true,
      }
    },
    routeRules: {
      '/api/**': { proxy: `${process.env.API_ORIGIN}/api/**` },
    },
  }
  /*

  }*/
})

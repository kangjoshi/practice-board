export function fetch(url, opts = {}) {
    const config = useRuntimeConfig();

    Object.assign(opts, {
        baseURL: process.server ? config.apiOrigin : '',
        async onRequest(context) {
            //const isDev = process.env.NODE_ENV === 'development'
            // 참고: https://github.com/nuxt/framework/issues/2557#issuecomment-1003865620
            //context.options.headers = new Headers(context.options.headers)
            //context.options.headers.append('Authrization', 'Bearer TOKEN_FOR_DEV')
        },
    });
    return $fetch(url, opts);
}
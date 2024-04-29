export class BoardUseCase {
    async load() {
         const response = await fetch(`/api/boards`, { method: 'GET' });

         return response;
    }

    async save(board) {
        const response = await fetch(`/api/boards`, { method: 'POST', body: {...board} })
    }

}
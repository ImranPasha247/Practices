const commentsContainer = document.getElementById('comments-container');
const newCommentInput = document.getElementById('new-comment');
const submitCommentButton = document.getElementById('submit-comment');
submitCommentButton.addEventListener('click', function () {
   const newComment = newCommentInput.value.trim();
  if (newComment) {
     const commentDiv = document.createElement('div');
    commentDiv.className = 'comment';
    commentDiv.textContent = newComment;
    commentsContainer.appendChild(commentDiv);
    newCommentInput.value = '';
  } else {
    alert('Please write a comment before submitting.');
  }
});
